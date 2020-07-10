package point3D;

import point2D.Point2D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(){
    }

    public Point3D(float x,float y, float z){
        super(x,y);
        this.z = z ;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        float[] XYZ = new float[3];
        XYZ[0] = super.getX() ;
        XYZ[1] = super.getY() ;
        XYZ[2] = z ;
        return XYZ;
    }

    public void setXYZ(float x , float y , float z){
        super.setXY(x,y);
        this.z = z ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}'+super.toString();
    }
}
