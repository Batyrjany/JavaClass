package Assignments;

import java.util.*;
public class replit214 {


	//rgb array with 3 ints is used to hold r,g,b values
    private int[] rgb = new int[3];
     String colors ="";
    /**
     * Available colors - ready with rgb code
     */
    
    public final static int[] WHITE     = new int[]{255, 255, 255};
    public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
    public final static int[] GRAY      = new int[]{128, 128, 128};
    public final static int[] DARK_GRAY  = new int[]{64, 64, 64};
    public final static int[] BLACK     = new int[]{0, 0, 0};
    public final static int[] RED       = new int[]{255, 0, 0};
    public final static int[] PINK      = new int[]{255, 175, 175};
    public final static int[] ORANGE    = new int[]{255, 200, 0};
    public final static int[] YELLOW    = new int[]{255, 255, 0};
    public final static int[] GREEN     = new int[]{0, 255, 0};
    public final static int[] MAGENTA   = new int[]{255, 0, 255};
    public final static int[] CYAN      = new int[]{0, 255, 255};
    public final static int[] BLUE      = new int[]{0, 0, 255};


    /**
     * Public constructor accepts 3 ints that represent color code.
     * assign 3 int parameters to rgb array indexes(0,1,2)
     * @param r
     * @param g
     * @param b
     */
    public replit214(int r, int g, int b){
       //TODO
       rgb = new int[]{r,g,b};
//       r=rgb[0];
//       g=rgb[1];
//       b=rgb[2];    
    
       if(Arrays.equals(rgb,WHITE))
           colors="white";
       else if(Arrays.equals(rgb,LIGHT_GRAY))
           colors="light gray";
       else if(Arrays.equals(rgb,GRAY))
           colors="gray";
       else if(Arrays.equals(rgb,DARK_GRAY))
           colors="dark gray";
       else if(Arrays.equals(rgb,BLACK))
           colors="black";
       else if(Arrays.equals(rgb,RED))
           colors="red";
       else if(Arrays.equals(rgb,PINK))
           colors="pink";
       else if(Arrays.equals(rgb,ORANGE))
           colors="orange";
       else if(Arrays.equals(rgb,YELLOW))
           colors="yellow";
       else if(Arrays.equals(rgb,GREEN))
           colors="green";
       else if(Arrays.equals(rgb,MAGENTA))
           colors="magenta";
       else if(Arrays.equals(rgb,CYAN))
           colors="cyan";
       else if(Arrays.equals(rgb,BLUE))
           colors="blue";

     else
     colors="n/a";
    }

    /**
     * Public no- args constructor: sets default color as "white" (255,255,255)
     * try to use this() keyword to call above constructor to set white color
     */
    public replit214() {
        //TODO
        this.rgb[0]=255;
        this.rgb[1]=255;
        this.rgb[2]=255;
      colors="white";
    }

    /**
     * Override toString(from Object class).
     * Provides string description of the color like "red" ,"blue" based on
     * rgb value.
     * Compare value of rgb array with static color code arrays
     * and find out what color it is. Arrays.equals(arr1,arr2) is easiest way
     * to compare 2 int arrays
     * @returns a String color name like
     * "white" or "blue"
     * If rgb values does not match any available combinations, return "n/a"
     *
     * Ex:
     * Color color = new Color();
     * System.out.println(color.toString() ) ; // prints "white"
     *
     * Color color = new Color(255, 0, 0);
     * System.out.println(color.toString() ) ; // prints "red"
     * 
     * Color color4 = new Color(192, 192, 192); 
       System.out.println(color4 ) ; // prints "light gray"
     */
    public String toString() {
        

       //TODO
       
        return colors; //change this to return colors
    }

    
    public static void main(String[] args) {
		
    	
    	replit214 color = new replit214();
    	  System.out.println(color.toString() ) ; // prints "white"

    	  replit214 color2 = new replit214(255, 0, 0);
    	  System.out.println(color2.toString() ) ; // prints "red"

    	  replit214 color3 = new replit214(255, 44, 88); 
    	  System.out.println(color3.toString() ) ; // prints "n/a"
    	  
    	  replit214 color4 = new replit214(192, 192, 192); 
    	  System.out.println(color4 ) ; // prints "light gray"
    	  }
	}

