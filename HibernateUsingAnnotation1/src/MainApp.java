import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory =new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("Car");
		
		TwoWheeler bike=new TwoWheeler();
		bike.setVehicleName("Two Wheeler name");
		bike.setSteeringHandle("steeringHandle");
		
		FourWheeler car= new FourWheeler();
		car.setVehicleName("SteeringWheel");
		car.setSteeringWheel("SteeringWheel");
		
		session.save(vehicle);
		session.save(car);
		session.save(car);
		
		tx.commit();
		session.close();
	}

}
