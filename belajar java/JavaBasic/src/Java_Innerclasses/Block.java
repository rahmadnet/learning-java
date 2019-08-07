package Java_Innerclasses;


public class Block 
{
	Flat[] flats;
	
	// inner class
	class Flat 
	{
		Room[] rooms;
		
		// inner class
		class Room 
		{
			private int width;
			private int height;
			private int numWindow;
			
			// costructor
			// fill in the marked area
			// Do not change anytjing else
			// it should be added to array "rooms" when a room object is created
			// Clearly, add new Room to end of array, Update the array
			
			public Room(int w, int h, int n)
			{
				super();
				this.width = w;
				this.height = h;
				this.numWindow = n;
				
				//******************MARKED AREA*****************
				
				int i = 0; while (rooms[i] != null) i++;
				rooms[i] = this;
				
				//*******************END_OF_MARKED_AREA**********
			}
			
			// Please do not change anything in this method.
			@Override
			public String toString() {
				return width + "/" + height + "/" + numWindow;
			}
		}
		
		// constructor 
		// Fill in the marked area
		// Do not change anything else
		// it should be added to array, Update the array
		public Flat()
		{
			super();
			rooms =new Room[100];
			
			//***************MARKED AREA******************
			
			int i = 0; while(flats[i]!= null) i++;
			flats[i] = this;
			
			//****************END OF MARKED AREA**********
		}
	}
	
	// static inner class
	static class Process
	{
		// Fill in the blanks
		// Return number of flats in given block object
		// You must write it as one return command
		static int getNumFlat(Block b)
		{
			int i = 0;
			
			while (b.flats[i]!=null)i++;
			
			return i;
		}
		
		// Fill in the blanks
		// Return number of rooms in given flat object
		// You must write it as one return command
		
		static int getNumRoom(Flat f)
		{
			int i = 0; while (f.rooms[i]!=null) i++;
			return i;
		}
		
		// Fill in the blanks
		// Return height of given room object
		// You must write it as one return command
		static int getHeightRoom(Flat.Room r)
		{
			return r.height;
		}
		
		// Fill in the blanks
		// Return width if given room object
		// You must write it as one return command
		static int getWidthRoom(Flat.Room r)
		{
			return r.width;
		}
		
		// Fill in the blanks
		// Return numWindow of given room object
		// You must write it as one return command
		static int getNumWindowRoom(Flat.Room r)
		{
			return r.numWindow;
		}
		
		// Fill in the blanks
		// Return total number of rooms in given block object
		static int getTotalNumRoom(Block b)
		{
			int i = 0;
			int sum = 0;
			while (b.flats[i]!=null)
			{
				Flat flat = b.flats[i];
				int j = 0;
				while (flat.rooms[j]!=null)
				{
					j++;
				}
				sum +=j;
				i++;
			};
			return sum;
		}
		
		// Fill in the blanks
		// Return true, if given room object is a square
		// Return false, if else
		// You must write it as one rturn command
		static boolean isSquare(Flat.Room r)
		{
			return r.height == r.width ? true :false;
		}
		
		// Fill in the blanks
		// Scan all rooms in given block object
		// Find the room which has maximum area
		// Return it
		static Flat.Room findMaxRoomArea(Block b)
		{
			Flat.Room biggestRoom = null;
			int area = 0;
			
			int i = 0;
			
			while (b.flats[i]!=null)
			{
				Flat flat = b.flats[i];
				int j = 0;
				
				while (flat.rooms[j]!= null)
				{
					Flat.Room room = flat.rooms[j];
					
					if((room.width*room.height)>area)
					{
						area = room.width*room.height;
						biggestRoom = room;
					}
					j++;
				}
				i++;
			};
			System.out.println(biggestRoom);
			return biggestRoom;
		}
	}
	// constructor
	// Please do not change anything in this constructor
	public Block()
	{
		super();
		flats = new Flat[100];
	}
}
