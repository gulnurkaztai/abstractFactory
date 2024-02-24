
/**
 * 
 * Abstract Factory class @ManufacturerFactory must have following three methods
 * 
 * @buildComputer(ManufacturerEnum) - return @ManufacturerFactory
 * 
 * @createGpu(GpuEnum gpuEnum) - return @Gpu
 * @createMotherboard(MotherboardEnum motherboardEnum) - return @Motherboard
 *
 * 
 * 
 *                                    This Abstract Factory
 *                                    class @ManufacturerFactory extended by
 *                                    following two concrete classes.
 * 
 *                                    1. @MSIComputerFactory - TODO
 *                                    2. @ASUSComputerFactory - TODO
 * 
 *                                    Each of the above Factory should be able
 *                                    to produce desired @Gpu and
 * @Motherboard based on the value defined in the @GpuEnum and @MotherboardEnum.
 * 
 * 
 *              Example:
 * 
 *              if @ManufacturerEnum = MSI and @MotherboardEnum = QUALCOMM, it
 *              should create an instance of @MSIQUALCOMMMotherboard - TODO
 * 
 * 
 * 
 */

 public abstract class ManufacturerFactory {

	private static final ManufacturerFactory Asus = null;

	public ManufacturerFactory buildComputer(ManufacturerEnum manufacturer) {
		if (manufacturer == ManufacturerEnum.ASUS) {
			return Asus;
		} else if (manufacturer == ManufacturerEnum.MSI) {
			return Asus;
		} else

			return null;
	}

	public abstract Gpu createGpu(GpuEnum gpuEnum);

	public abstract Motherboard createMotherboard(MotherboardEnum motherboardEnum);
}