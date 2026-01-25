public class Pen {
    public static void main(String[] args) {
        Pens P1 = new Pens();
        P1.SetColour("Green");
        P1.SetTip(7.5);
        System.out.println(P1.Colour);
        System.out.println(P1.Tip);
    }
}

class Pens{
    String Colour;
    double Tip;

void SetColour(String newColour){
    Colour = newColour;
}
void SetTip(double newTip){
    Tip = newTip;
}
}
