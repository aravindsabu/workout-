import java.util.*;
class tile
  {
	  int edge_len;	
	  int area;
	  tile(int edge_len)
	    {
		  this.edge_len=edge_len;
		  this.area=edge_len*edge_len;
	    }
	  int get_area()
	    {
		  return area;
	    }
  }

class floor
  {
	   int length;
	   int width;
       floor(int length, int width)
	       {
		     this.length = length;
		     this.width = width;
	       }
       void totaltiles(tile t1)
	       {
		     int tile_area = t1.get_area();
		     int floor_area = length*width;
		     int no_of_tiles = (floor_area/tile_area);
		     System.out.println("Number of Tiles = "+no_of_tiles);
	       }
  }

class counttile
  {
	 public static void main(String args[])
	   {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter length of the Tile ");
		 int tile_length = sc.nextInt();
		 tile t = new tile(tile_length);
     	 System.out.println("Enter length and width of  the Floor ") ;
		 int floor_length = sc.nextInt();
		 int floor_width = sc.nextInt();
		 floor f = new floor(floor_length,floor_width);
		 f.totaltiles(t);
	  }
  }