package point3D;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(10f,20f,30f);
        System.out.println(point3D);

        float[] arr = point3D.getXYZ();
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("after:");
        point3D.setXYZ(50f,60f,80f);
        float[] arr2 = point3D.getXYZ();
        for (int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
