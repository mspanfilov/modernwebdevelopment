import java.util.Set;
import java.util.concurrent.
BlockingQueue;

/** ����. */
interface Flavour extends Comparable<Flavour> {
}

/** ������� � �����-������ ������. */
interface Candy {
    Flavour getFlavour();
}

/** ��������� ������. */
interface CandyEater {
    void eat(Candy candy);
}

/** ������� ������� �����. */
interface CandyEatingFacility {

    /**
     * ��������� ������������ �������� ������ �� ������� <code>candies</code>
     * ����������� <code>candyEaters</code>.
     * <p/>
     * ������������, ���<br/>
     * &bull; � ����� ������ ������� ��������� �� ����� ����� ������� ������� ����� �<br/>
     * &bull; ������� ������ ����� ��������� � ��� ����������, � ������� ��� ���������� � �������.
     * <p/>
     * ���������� ���������� ����� ������� ��������.
     * <p/>
     * ���������� ���������, ������� �������� ��������� � ����� ������,
     * ������ ���� �� ���, ��� �� �����������.
     *
     * @param candies     ������� ������
     * @param candyEaters ����� ���������� ������
     */
    void launch(BlockingQueue<Candy> candies, Set<CandyEater> candyEaters);

    /**
     * ���������� ������ ����� ������ �� ������� � ���������� ����������,
     * ����� ��� ��� ������� �� ������� ������� �������.
     */
    void shutdown();
}
