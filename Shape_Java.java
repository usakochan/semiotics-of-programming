class Shape{
    double width, height;
    Shape(double w, double h){ width=w; height=h; } //データ初期化のための特殊な操作（構成子）
    public double area(){ return width*height; }
}
//データと関数(Shapeとarea)をひとまとめにしたクラスの定義
//doubleは基本型（Javaに備わっている）

class Rectangle extends Shape{ //継承することで記述を省略（Shapeは初期化関数）
    Rectangle(double w, double h){ super(w,h); }
}
//データ構造と関連する関数を定めるクラスの定義

class Ellipse extends Shape{ //クラスの定義
    Ellipse(double w, double h){ super(w,h); }
    public double area(){ return Math.PI*width*height/4.0; } //area関数を上書きして再定義
}
//データ構造と関連する関数を定めるクラスの定義

class Circle extends Ellipse{ //クラスの定義
    Circle (double r){ super(r*2.0, r*2.0); }
}
//データ構造と関連する関数を定めるクラスの定義

void run(){
    Rectangle r = new rectangle (5.0, 8.0); //rがRectangle型のデータを保持することを宣言している
    Ellipse   u = new Ellipse (3.0, 4.0);   //uがEllipse型のデータを保持することを宣言している
    Circle    v = new Circle (3.0);         //vがCircle型のデータを保持することを宣言している
    //↑定義部分　
    Shape [] ss = new Shape[]{r, u, v}; //配列ssに格納。Shapeを継承し続けたことで、Shape型の配列として定義することができるようになっている。
    for (Shape s : ss) { putStr("area: " + s.area() + "\n")} //"\n"はリテラル
    //↑使用部分
} 