package abstraction;

public class GeoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Geomatary [] geoObject = new Geomatary[3];
		geoObject[0]=new Circle(2.0);
		geoObject[1]=new Rectangle(2.0,4.0);
		geoObject[2]=new Rectangle(5.0,5.0);
		double totalArea=0;
		for(int i=0;i<3;i++) {
			totalArea = totalArea +geoObject[i].area();
		}
		System.out.println("Total Area = "+totalArea);
	}

}
