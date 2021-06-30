package br.com.meli.day2.GeometricFigure;

public class GeometricFigureUtility {

    public static double areaMedia (GeometricFigure[] arr){

         double media = 0;

        for ( GeometricFigure a: arr) {
            media += a.area();
        }

        return media/arr.length;

    }

    public static void main(String[] args) {

        GeometricFigure[] arr = new GeometricFigure[3];

        arr[0] = new Circle(40);
        arr[1] = new Rectangle(20,40);
        arr[2] = new Triangle(40,60);

        System.out.println(GeometricFigureUtility.areaMedia(arr));

    }

}
