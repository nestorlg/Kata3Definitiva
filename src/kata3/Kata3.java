package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
        histogram.increment("gmail");
        histogram.increment("gmail");
        histogram.increment("hotmail");
        histogram.increment("hotmail");
        histogram.increment("hotmail");
        histogram.increment("outlook");
        histogram.increment("dis.ulpgc");
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
    
}
