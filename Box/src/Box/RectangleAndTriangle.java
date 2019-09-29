/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Box;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class RectangleAndTriangle {
   
   public static void main(String [] args){
        Box boxobj = new Box(0,0,0);
        IsoscelesRight isoobj = new IsoscelesRight(3);
        Geometric4Tester tst = new Geometric4Tester();
        
        boxobj.boxA();
        
        
        System.out.println("Box a: " + boxobj.toString());
        System.out.println("Box a surface area: "+ boxobj.getArea());
        
        boxobj.boxB();
        System.out.println("Box b: " + boxobj.toString());
        System.out.println("Box b surface area: "+ boxobj.getArea());
        
        System.out.println("Check if Box a and Box b are equal? " + boxobj.equals());
        
        System.out.println("IsoscelesRight c" + isoobj.toString());
        System.out.println("IsoscelesRight c area: " + isoobj.getArea());
        
        System.out.println("IsoscelesRight d" + isoobj.toString());
        System.out.println("IsoscelesRight d area: " + isoobj.getArea());

        System.out.println("Check if IsoscelesRight c and IsoscelesRight d are equal? " + isoobj.equals());
    }
//end of main method

    //method of rectangle2
    
    public static class Rectangle2{
        int area, w, l, h;
        String ans;
        
        public int getArea(){
            area = w*l*h;
            return area;
        }
        
        public String toString(){
            return "[Box: length = " + l + ",width = " + w +", height = " + h + "]";
        }
        
    } //end of rectangle2

    //start of box class subclass of rectangle
    public static class Box extends Rectangle2{
        private int height;
        
        public Box(int l, int w, int h){
            //constructor
            Rectangle2 box = new Rectangle2();
            //end of constructor
        }
        
        public int getHeight(){
            
            return height;
        }
        
        public int getArea(){
            
            area = (2*w*l) + (2*l*h) + (2*h*w);
            return area;
        }
        
        public int boxA(){
            
            w = 3;
            l = 2;
            h = 4;
            return w + l + h;
        }
        
        public int boxB(){
            
            w = 7;
            l = 4;
            h = 4;
            return w + l + h;
        }
        
        public String equals(){
            if (boxA() == boxB()){
                
                ans = "true";
            }
            else{
                ans = "false";
            }
            
            return ans;
        }
        
    }
    
    //end of box class

    //start of Triangle class
    public static class Triangle{
        double equalSide = 3, area, sideC;
        String ans;
        
        public String equals(){
            
            if (equalSide == equalSide){
                ans = "true";
            }
            else{
                ans = "false";
            }
            
            return ans;
        }
    
        public double getArea(){
            
            area = (equalSide*equalSide)/2;
            return area;
        }
        
    } // end of Triangle class
    //start of isosceles class subclass of triangle
    public static class IsoscelesRight extends Triangle {
        
        public IsoscelesRight(double equalSize){
            //constructor
        }
        
        public double getEqualSide(){
            
            return equalSide;
        }
        
        public double getNotEqualSide(){
            sideC = equalSide*Math.sqrt(2);
            return sideC;
        }
        
        public String toString(){
            return "[IsoscelesRight: equal_side = " + getEqualSide() + ",not_equal side = " + getNotEqualSide();
        }
    }
    //end of isoceles
    
    public static class Geometric4Tester{
        
        public Geometric4Tester(){
            //constructor
            IsoscelesRight tst = new IsoscelesRight(3);
            tst.equalSide = 3.0;
            //end of constructor
        }
    }
}
//end of Class RectangleAndTriangle