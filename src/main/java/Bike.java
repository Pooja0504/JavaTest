public class Bike {
    public int gear;
    public int speed;

    public Bike(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

	public static boolean writeStreamToFile(InputStream stream, File file){
		FileOutputStream out = null;
		try{
			out = new FileOutputStream(file);
			byte[] buffer = new byte[4096];
			int byeRead;
			while (byteRead = stream.read(buffer) != -1){
				out.write(buffer,0,byeRead);
			}
			out.close();
			return true;	
		} catch(Exception e){
			e.printStackStrace();
			return false;
		} finally{
			if (out !=null){
				try{
					out.close();
				} catch(IOException e){
					e.printStackStrace();
				}
				out = null;
			}
		}
		
	}
    public String toString()
    {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}

