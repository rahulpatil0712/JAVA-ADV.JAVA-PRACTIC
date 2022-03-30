
import java.awt.*;
class College extends Frame
{
	College()
	{
		setSize(700,600);
		setLocation(200,200);
		setTitle("College Form");

		setLayout(null);

		Label L1= new Label("ASC COLLEGE CHOPDA");
		L1.setBounds(300,25,130,60);
		Label L2= new Label("BCA Department");
		L2.setBounds(310,60,120,70);
		Label L3= new Label("Adimission Form");
		L3.setBounds(310,95,130,90);
		Label L4= new Label("Form");
		L4.setBounds(25,150,130,90);
		TextField T1=new TextField();
		T1.setBounds(165,180,130,30);
		Label L5= new Label("Application No.");
		L5.setBounds(305,180,130,30);
		TextField T2=new TextField();
		T2.setBounds(445,180,130,30);
		Label L6= new Label("Name");
		L6.setBounds(25,250,50,30);
		TextField T3=new TextField();
		T3.setBounds(125,250,200,30);
		Label L7=new Label("Address");
		L7.setBounds(25,300,130,30);
		TextField T4=new TextField();
		T4.setBounds(165,300,200,30);
		Label L8=new Label("Gender");
		L8.setBounds(25,350,130,30);
		CheckboxGroup G1=new CheckboxGroup();
		Checkbox c1=new Checkbox("Male",G1,false);
		c1.setBounds(165,350,130,30);
		Checkbox c2=new Checkbox("Female",G1,false);
		c2.setBounds(305,350,130,30);
		Label L9=new Label("Marride");
		L9.setBounds(445,350,130,30);
		CheckboxGroup G2=new CheckboxGroup();
		Checkbox c3=new Checkbox("Yes",G2,false);
		c3.setBounds(585,350,130,30);
		Checkbox c4=new Checkbox("No",G2,false);
		c4.setBounds(720,350,130,30);
		Label L10=new Label("facility Requierd");
		L10.setBounds(25,400,130,30);
		Checkbox c5=new Checkbox("Hostel");
		c5.setBounds(165,400,130,30);
		Checkbox c6=new Checkbox("Parking");
		c6.setBounds(305,400,130,30);
		Checkbox c7=new Checkbox("Gym");
		c7.setBounds(445,400,130,30);
		Checkbox c8=new Checkbox("Library");
		c8.setBounds(585,400,130,30);
		Label L11=new Label("SSC");
		L11.setBounds(25,450,130,30);
		TextField T5=new TextField();
		T5.setBounds(165,450,130,30);
		Label L12=new Label("HSC");
		L12.setBounds(305,450,130,30);
		TextField T6=new TextField();
		T6.setBounds(445,450,130,30);
		Button B1=new Button("Submit");
        B1.setBounds(225,500,130,30);

        add(L1);
		add(L2);
		add(L3);
		add(L4);
		add(T1);
		add(L5);
		add(T2);
		add(L6);
		add(T3);
		add(L7);
		add(T4);
		add(L8);
		add(c1);
		add(c2);
		add(L9);
		add(c3);
		add(c4);
		add(L10);
		add(c5);
		add(c6);
		add(c7);
		add(c8);
		add(L11);
		add(T5);
		add(L12);
		add(T6);
		add(B1);
		show();
	}
	public static void main(String agrs[])
	{
		College A= new College();
	}
}






