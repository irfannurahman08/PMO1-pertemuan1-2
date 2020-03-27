package online.irfandev.example.pertemuan1;

public class ProsesHitung2 extends ProsesHitung{
    private double bil1;
    private double bil2;

    public ProsesHitung2() {
    }

    public ProsesHitung2(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    public double getBil1() {
        return bil1;
    }

    public void setBil1(double bil1) {
        this.bil1 = bil1;
    }

    public double getBil2() {
        return bil2;
    }

    public void setBil2(double bil2) {
        this.bil2 = bil2;
    }


    @Override
    double getTambah() {
        return bil1+bil2;
    }

    @Override
    double getKurang() {
        return bil1-bil2;
    }

    @Override
    double getKali() {
        return bil1*bil2;
    }

    @Override
    double getBagi() {
        return bil1/bil2;
    }
}
