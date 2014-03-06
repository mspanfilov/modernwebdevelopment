import java.nio.charset.Charset;
import java.util.List;

/** Разрезает строку по словам и кодирует её по сегментам. */
interface CuttingStringEncoder {

    /**
     * Разбивает строку <code>source</code> на как можно меньшее количество сегментов
     * как можно большей длины, не превышающей ограничение.
     * <p/>
     * Если получается более одного сегмента, то в начале каждого указывается индекс: текст «X/Y » (без кавычек,
     * число X, слэш, число Y, пробел), где X — номер сегмента, Y — общее количество сегментов.
     * <p/>
     * Строка разбивается на сегменты по возможности по пробелам; только если длина слова
     * превышает длину сегмента (с учётом индекса), слово будет разрезано. Пробельные символы на границе сегментов
     * отбрасываются. Повторяющиеся пробельные символы сокращаются до одного.
     * <p/>
     * Возвращает получившиеся сегменты в указанной кодировке.
     * Длина каждого сегмента с индексом в кодировке <code>charset</code> не превышает <code>maxSegLen</code> байтов.
     * <p/>
     * Переданные параметры должны быть не нул, это не проверяется.
     * <p/>
     * Если с переданными параметрами закодировать исходную строку невозможно,
     * выкидывает {@link IllegalArgumentException} с комментарием.
     *
     * @param source    исходная строка
     * @param charset   кодировка
     * @param maxSegLen максимальная длина сегмента в байтах
     * @return сегменты строки в указанной кодировке
     */
    List<String> cutAndEncode(String source, Charset charset, int maxSegLen) throws IllegalArgumentException;
}