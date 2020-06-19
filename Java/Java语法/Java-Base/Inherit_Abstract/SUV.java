package cn.sherlock.Inherit_Abstract;

public class SUV extends Auto {

    private int miniCar = 4295;
    private int midCar = 5070;

    public SUV(String brand, int length, double price) {
        super(brand, length, price);
    }

    /**
     *
     * class SUV extends Auto {
     * 		    // 车长标准
     * 		    private int miniLength = 4295;
     * 		    private int midLength = 5070;
     *
     * 		    public SUV(double length, double price) {
     * 		        super("SUV", length, price);
     *                        }
     * 			// 判断 小型车
     * 		    public boolean miniSUV() {
     * 		        return getLength() <= miniLength;
     *            }
     *
     * 		    // 判断 大型车
     * 		    public boolean largeSUV() {
     * 		        return getLength() > midLength;
     *            }
     *
     * 		    // 判断 中型车
     * 		    public boolean midSUV() {
     * 		        return getLength() > miniLength && getLength() <= midLength;
     *            }
     *
     *
     */
}
