package bean;

/**
 * @author caichengcheng
 * date:2020-01-10
 */
public class ChineseBook extends Book {
    @Override
    protected void desc() {
        System.out.println(this + ": chinese book");
    }
}
