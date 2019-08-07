package Java_Innerclasses;

public class Test {

	// Please do not change anything.
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Block b1 = new Block();
		
		Block.Flat f1 = b1.new Flat();
		Block.Flat f2 = b1.new Flat();
		Block.Flat f3 = b1.new Flat();
		
		Block.Flat.Room r1 = f1.new Room(5, 6, 2);
		Block.Flat.Room r2 = f1.new Room(4, 6, 1);
		Block.Flat.Room r3 = f1.new Room(5, 5, 2);
		
		Block.Flat.Room r4 = f2.new Room(5, 6, 2);
		Block.Flat.Room r5 = f2.new Room(8, 8, 3);
		Block.Flat.Room r6 = f2.new Room(4, 6, 1);
		Block.Flat.Room r7 = f2.new Room(5, 5, 2);
		
		Block.Flat.Room r8 = f3.new Room(5, 6, 2);
		Block.Flat.Room r9 = f3.new Room(8, 8, 3);
		Block.Flat.Room r10 = f3.new Room(8, 12, 3);
		Block.Flat.Room r11 = f3.new Room(5, 5, 2);
		
		int score = 0;
		
		if (Block.Process.getHeightRoom(r1) == 6)
		{
			score += 5;
		}
		if (Block.Process.getWidthRoom(r6) == 4)
		{
			score += 5;
		}
		if (Block.Process.getNumWindowRoom(r1) == 2)
		{
			score += 5;
		}
		if (Block.Process.isSquare(r3) == true)
		{
			score += 10;
		}
		if (Block.Process.getNumFlat(b1) == 3)
		{
			score += 15;
		}
		if (Block.Process.getNumRoom(f1) == 3)
		{
			score += 8;
		}
		if (Block.Process.getNumRoom(f2) == 4)
		{
			score += 8;
		}
		if (Block.Process.getTotalNumRoom(b1) == 11)
		{
			score += 20;
		}
		
		Block.Flat.Room r = Block.Process.findMaxRoomArea(b1);
		if (r != null && r.toString().equals("8/12/3"))
		{
			score += 24;
		}
		System.out.println("Your grade is " + score);

	}

}
