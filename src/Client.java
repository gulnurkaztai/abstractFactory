/**
 * 
 * ABSTRACT FACTORY:
 * 
 * The Abstract Factory design pattern falls under the creational design pattern
 * category. It provides an @interface or an @abstract class for creating
 * families of related objects without exposing their concrete implementations.
 *
 * This pattern is useful when there is a need to create multiple related
 * objects that belong to a common family or share a common theme.
 * 
 * 
 * SOLUTION
 * 
 * Design a solution that builds MSI or ASUS computer by adding @Gpu
 * and @Motherboard to it based on type defined in @GpuEnum and @MotherboardEnum
 * 
 * 
 * !! IMPLEMENT YOUR SOLUTION BASED ON ABSTRACT FACTORY DESIGN PATTERN !!
 * 
 * !! SAMPLE OUTPUT !!
 * 
 * ------------------------------------- Building MSI Computer Adding AMD GPU to
 * MSI Computer Adding Broadcom Motherboard to MSI Computer
 * 
 * Building ASUS Computer Adding NVIDIA GPU to ASUS Computer Adding Qualcomm
 * Motherboard to ASUS Computer --------------------------------------
 * 
 */

 public class Client {

	public static void main(String[] args) {

		ManufacturerFactory asus = new Asus(GpuEnum.AMD, MotherboardEnum.BROADCOM);
		System.out.println(asus);

		ManufacturerFactory msi = new MSI(GpuEnum.AMD, MotherboardEnum.BROADCOM);
		System.out.println(msi);

	};

}
