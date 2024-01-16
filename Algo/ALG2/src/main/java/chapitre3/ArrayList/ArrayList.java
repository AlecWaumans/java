package chapitre3.ArrayList;

/**
 *
 * @author alecw
 */
public class ArrayList {

    private String[] tab;
    private int size;

    public ArrayList(int maxSize) {
        if (maxSize < 0) {
            throw new IllegalArgumentException("La taille maximale doit être un entier Positif " + maxSize);
        }
        this.tab = new String[maxSize];
        this.size = maxSize;
    }

    public ArrayList() {
        this.tab = new String[10];
        this.size = 10;
    }

    public int getSize() {
        return this.size;
    }

    public void addList(String value) {
        if (size >= tab.length) {
            throw new IllegalArgumentException("La taille maximal est atteinte! " + size);
        }
        tab[size] = value;
        size++;
    }

    public void add(int pos, String value) {
        if (size >= tab.length) {
            throw new IllegalArgumentException("La taille maximal est atteinte! " + size);
        }
        if (pos < 0 || pos > size) {
            throw new IllegalArgumentException("La position est en dehors du tab " + size);
        }
        for (int i = size; i > pos; i--) {
            tab[i] = tab[i - 1];
        }
        tab[pos] = value;
    }

    public String getValue(int pos) {
        if (pos < 0 || pos > size) {
            throw new IllegalArgumentException("La position est en dehors du tab " + size);
        }
        return tab[pos];

    }

    public String setValue(int pos, String value) {
        if (pos < 0 || pos > size) {
            throw new IllegalArgumentException("La position est en dehors du tab " + size);
        }
        return tab[pos] = value;
    }

    public int indexOf(String value) {
        int pos = 0;
        while (pos < size && !tab[pos].equals(value)) {
            pos++;
        }
        return (pos < size) ? pos : -1;
    }

    public boolean contains(String value) {
        return indexOf(value) != -1;
    }

    public void removePos(int pos) {
        if (pos < 0 || pos > size) {
            throw new IllegalArgumentException("La position est en dehors du tab " + size);
        }
        for (int i = pos + 1; i < size; i++) {
            tab[i - 1] = tab[i];
        }
        size--;
    }

    public boolean remove(String value) {
        int pos = indexOf(value);
        if (pos == -1) {
            return false;
        }
        removePos(pos);
        return true;
    }

    public void clear() {
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean remove2(String value) {
        if (!contains(value)) {
            return false;
        }
        removePos(indexOf(value));
        return true;
    }

}
