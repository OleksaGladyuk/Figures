package com.epam.rd.autotasks.figures;

import static java.lang.Math.PI;

class Circle extends Figure {
    public Point A;
    double r;
     public Circle( Point a, double r) {
         this.A = a;
         this.r = r;
     }

     @Override
     public double area() {
    double area = PI * Math.pow(r, 2);
    return area;
     }

     @Override
     public String pointsToString() {
         return "(" + A.getX() + "," + A.getY() + ")";
     }
     @Override
     public String toString() {
         return "Circle[" + "(" + A.getX() + "," + A.getY() + ")" + r + "]";
     }

     @Override
     public Point leftmostPoint() {
         return new Point (A.getX() - r, A.getY());
     }
 }
