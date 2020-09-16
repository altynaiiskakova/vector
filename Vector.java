public class Vector{
    double x; double y; double z;

    Vector(double x, double y, double z){
        this.x = x; this.y = y; this.z = z;
    }
    double length(){
        return Math.sqrt(x*x+y*y+z*z);
    }
    Vector scale(double a){
        return new Vector(x*a, y*a, z*a);
    }
    Vector norm(){
        double b = 1/length();
        return new Vector(x*b, y*b, z*b);
    }
    Vector add(Vector v2){
        return new Vector(this.x+v2.x, this.y+v2.y, this.z+v2.z);
    }
    Vector sub(Vector v2){
        return new Vector(this.x-v2.x, this.y-v2.y, this.z-v2.z);
    }
    Vector crossProduct(Vector v2){
        return new Vector(this.x*v2.y-this.y*v2.x,this.x*v2.z-this.z*v2.x,this.y*v2.z-this.z*v2.y);
    }

    public static void main(String[] args){
        Vector vector = new Vector(5.0, 6.0, 8.0);
        double l = vector.length();
        Vector v3 = vector.scale(2.0);
        Vector v4 = vector.add(vector.norm());
        Vector v5 = vector.crossProduct(new Vector(7, 9.55, 6.88));
        System.out.println(l); //11.180339887498949
        System.out.println(v3); //Vector3D@63961c42 (memory location of the object)
        System.out.println(v4); //Vector3D@65b54208
        System.out.println(v5); //Vector3D@1be6f5c3

    }
}
