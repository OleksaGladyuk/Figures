package com.epam.rd.autotasks.figures;

 class Triangle extends Figure {
     public Point a;
     public Point b;
     public Point c;

     public Triangle(Point a, Point b, Point c) {
         this.a = a;
         this.b = b;
         this.c = c;
     }

     @Override
     public double area() {
         double area2 = Math.abs((a.getX() - c.getX()) * (b.getY() - a.getY()) -
                 (a.getX() - b.getX()) * (c.getY() - a.getY())) / 2;
         return area2;
     }

     @Override
     public String pointsToString() {
         return "(" + a.getX() + a.getY() + ")" + "(" + b.getX() + b.getY() + ")" + "(" + c.getX() + c.getY() + ")";
     }

     public String toString() {
         return "[" + "(" + a.getX() + a.getY() + ")" + "(" + b.getX() + b.getY() + ")" + "(" + c.getX() + c.getY() + ")" + "]";
     }

     @Override
     public Point leftmostPoint() {
             double minX = a.getX();
             double minY = a.getY();
             if (b.getX() < minX) {
                 minX = b.getX();
             } else {
                 minY = b.getY();
             }
             if (c.getX() < minX) {
                 minX = c.getX();
             } else {
                 minY = c.getY();
             }
             return new Point(minX, minY);
         }
     }
