package com.epam.rd.autotasks.figures;

class Quadrilateral extends Figure {
    public Point A;
    public Point B;
    public Point C;
    public Point D;

    public Quadrilateral(Point A, Point B, Point C, Point D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    @Override
    public double area() {
        double aLen = Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2));
        double bLen = Math.sqrt(Math.pow(C.getX() - B.getX(), 2) + Math.pow(C.getY() - B.getY(), 2));
        double cLen = Math.sqrt(Math.pow(C.getX() - A.getX(), 2) + Math.pow(C.getY() - A.getY(), 2));

        double adLen = Math.sqrt(Math.pow(C.getX() - A.getX(), 2) + Math.pow(C.getY() - A.getY(), 2));
        double cdLen = Math.sqrt(Math.pow(D.getX() - C.getX(), 2) + Math.pow(D.getY() - C.getY(), 2));
        double dLen = Math.sqrt(Math.pow(D.getX() - A.getX(), 2) + Math.pow(D.getY() - A.getY(), 2));

        double halfPerimeter = (aLen + bLen + cLen) / 2;
        double halfPerimeterTwo = (adLen + cdLen + dLen) / 2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - aLen) * (halfPerimeter - bLen) * (halfPerimeter - cLen));
        double areaTwo = Math.sqrt(halfPerimeterTwo * (halfPerimeterTwo - adLen) * (halfPerimeterTwo - cdLen) * (halfPerimeterTwo - dLen));
        return area + areaTwo;
    }


    @Override
    public String pointsToString() {
        return "(" + A.getX() + "," + A.getY() + ")" + "(" + B.getX() + "," + B.getY() + ")" + "(" + C.getX() + "," + C.getY() + ")" + "(" + D.getX() + "," + D.getY() + ")";
    }
    public String toString() {
        return "Quadrilateral[" + "(" + A.getX() + "," + A.getY() + ")" + "(" + B.getX() + "," + B.getY() + ")" + "(" + C.getX() + "," + C.getY() + ")" + "(" + D.getX() + "," + D.getY() + ")" + "]";
    }

    @Override
    public Point leftmostPoint() {
        double minX = A.getX();
        double minY = A.getY();
        if (B.getX() < minX) {
            minX = B.getX();
        } else {
            minY = B.getY();
        }
        if (C.getX() < minX) {
            minX = C.getX();
        } else {
            minY = C.getY();
        }
        if (D.getX() < minX) {
            minX = D.getX();

        } else {
            minY = C.getY();
        }
        return new Point(minX, minY);
    }
}