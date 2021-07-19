package com.company.oop;

import java.util.Scanner;

public class Geometry {
    public Rectangle[] rectangles;
    public Square[] squares;
    public Circle[] circles;
    public void readRadiusFromConsole(){
        Scanner tara=new Scanner(System.in);
        System.out.println("Kaç tane daire var?");
        int countOfCircle=tara.nextInt();
        Circle[] circles=new Circle[countOfCircle];
        for(int c=0; c<countOfCircle;c++){
            System.out.println((c+1) +". Dairenin yarıçapını girin");
            int radius=tara.nextInt();

            circles[c]=new Circle(radius);
        }
        this.circles=circles;
    }

    public void calculateAreaOfCircle(){
        System.out.println("Girdiğiniz dairelerin alanları:");
        Double[] areas= new Double[circles.length];
        for(int cA=0; cA<circles.length; cA++){
            double area= 3.14*(circles[cA].getRadius()*circles[cA].getRadius());
            areas[cA]=area;
            System.out.println((cA+1) +"." +"Dairenin alanı: " +areas[cA]);
        }
    }


    public void calculateCircumferenceOfCircle(){
        System.out.println("Girdiğiniz dairelerin çevreleri:");
        Double[] circumferences=new Double[circles.length];
        for(int cCirc=0; cCirc<circles.length; cCirc++){
            double circumference= 2*3.14*circles[cCirc].getRadius();
            circumferences[cCirc]=circumference;
            System.out.println((cCirc+1) +". Dairenin çevresi: " +circumferences[cCirc]);
        }
    }

    public void readEdgeLengthFromConsole(){
        Scanner tara=new Scanner(System.in);
        System.out.println("Kaç tane kare var?");
        int countOfSquare=tara.nextInt();
        Square[] squares=new Square[countOfSquare];
        for(int s=0;s<countOfSquare;s++){
            System.out.println((s+1) +". Karenin kenarını girin.");
            int edgeLength=tara.nextInt();
            squares[s]=new Square(edgeLength);
        }
        this.squares=squares;
    }
    public void calculateAreaOfSquare(){
        System.out.println("Girdiğiniz karelerin alanları: ");
        int[] areas=new int[squares.length];
        for(int sA=0;sA< squares.length;sA++){
            int area=squares[sA].edgeLength*squares[sA].edgeLength;
            areas[sA]=area;
            System.out.println((sA+1) +". Karenin alanı: " +areas[sA]);
        }
    }
    public void calculateCircumferenceOfSquare(){
        System.out.println("Girdiğiniz karelerin çevreleri: ");
        int[] circumferences= new int[squares.length];
        for(int sC=0; sC< squares.length; sC++){
            int circumference= 4*squares[sC].edgeLength;
            circumferences[sC]=circumference;
            System.out.println((sC+1) +". Karenin çevresi: " +circumferences[sC]);
        }
    }

    public void readRectangleFromConsole(){
        Scanner tara=new Scanner(System.in);
        System.out.println("Kaç tane dikdörtgen var?");
        int countOfRectangle=tara.nextInt();
        Rectangle[] rectangles=new Rectangle[countOfRectangle];
        for(int r=0; r<countOfRectangle;r++){
            System.out.println((r+1) +". Dikdörtgenin kısa kenarını girin.");
            int shortEdge=tara.nextInt();
            System.out.println((r+1) +". Dikdörtgenin uzun kenarını girin.");
            int longEdge=tara.nextInt();
            rectangles[r]=new Rectangle(shortEdge,longEdge);
        }
        this.rectangles=rectangles;
    }
    public void calculateAreaOfRectangle(){
        System.out.println("Girdiğiniz dikdörtgenlerin alanları: ");
        int[] areas=new int[rectangles.length];
        for(int rA=0; rA< rectangles.length; rA++){
            int area= rectangles[rA].longEdge*rectangles[rA].shortEdge;
            areas[rA]=area;
            System.out.println((rA+1) +". Dikdörtgenin alanı: " +areas[rA]);
        }
    }
    public void calculateCircumferenceOfRectangle(){
        System.out.println("Girdiğiniz dikdörtgenlerin çevreleri: ");
        int[] circumferences=new int[rectangles.length];
        for(int rC=0; rC< rectangles.length; rC++){
            int circumference= 2*(rectangles[rC].shortEdge + rectangles[rC].longEdge);
            circumferences[rC]=circumference;
            System.out.println((rC+1) +". Dikdörtgenin çevresi: " +circumferences[rC]);
        }
    }


}
