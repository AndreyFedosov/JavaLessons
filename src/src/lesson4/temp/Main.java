package lesson4.temp;

public class Main {

    static void draw(Figure figure) {
        figure.wtiteNme();
    }

    int getS(int summ)
    {
    int cc;
        if (summ > 100) {cc = 5;}
        else cc = 2;
        return cc;
    }

    public static void main(String[] args) {

        Figure figure1 = new Figure();
        Figure cirle1 = new Circle();
        Figure square = new Square();

        draw(figure1);
        draw(cirle1);
        draw(square);

        System.out.println(FileExtentions.doc);



    }
}
