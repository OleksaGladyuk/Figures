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
         double aLen = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
         double cLen = Math.sqrt(Math.pow(c.getX() - a.getX(), 2) + Math.pow(c.getY() - a.getY(), 2));
         double bLen = Math.sqrt(Math.pow(c.getX() - b.getX(), 2) + Math.pow(c.getY() - b.getY(), 2));
         double halfPerimeter = (aLen + bLen + cLen) / 2;
         double area = Math.sqrt(halfPerimeter * (halfPerimeter - aLen) * (halfPerimeter - bLen) * (halfPerimeter - cLen));
         return area;
     }

     @Override
     public String pointsToString() {
         return "(" + a.getX() + "," + a.getY() + ")" + "(" + b.getX() + "," + b.getY() + ")" + "(" + c.getX() + "," + c.getY() + ")";
     }

     public String toString() {
         return "Triangle[" + "(" + a.getX() + "," + a.getY() + ")" + "(" + b.getX() + "," + b.getY() + ")" + "(" + c.getX() + "," + c.getY() + ")" + "]";
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