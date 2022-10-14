public class Point3D extends Point2D{
    private float z = 0.0f;
    public Point3D(){}
    public Point3D(float x, float y,float z){
        super(x, y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y,float z) {
        this.z=z;
        this.setX(x);
        this.setY(y);
    }
    public float[] getXYZ(){
        float[] arr1 = {getX(),getY(),z};
        for (float a : arr1) {
            System.out.println(a + "\t");
        }
        return arr1;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }
}
