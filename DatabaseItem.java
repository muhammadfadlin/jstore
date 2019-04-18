import jdk.jfr.Category;
import jdk.jshell.Snippet;

import java.util.ArrayList;

/**
 * Write a description of class DatabaseItem here.
 *
 * @author (Achmad Kripton Nugraha)
 * @version (28/02/2019)
 */
public class DatabaseItem {
    // instance variables
    private static ArrayList<Item> ITEM_DATABASE = new ArrayList<Item>();
    private static int LAST_ITEM_ID = 0;

    /**
     * addItem method
     * method for adding item into this class
     * but the implementation is not completed, it should be adding item and return true if succcess, else false
     *
     * @param item for parameter of item to be added
     * @return value of boolean of status of addItem
     */
    public static boolean addItem(Item item) {
        try {
            for (Item i : ITEM_DATABASE
            ) {
                if ((i.getName().equals(item.getName())) || (i.getStatus().equals(item.getStatus()))
                       || (i.getSupplier().equals(item.getSupplier()))) {
                    throw new ItemAlreadyExistsException(item);
                }
            }
            ITEM_DATABASE.add(item);
            LAST_ITEM_ID = item.getId();
            return true;
        }
        catch (ItemAlreadyExistsException ex) {
            System.out.println(ex.getExMessage());
            return false;
        }

    }

    /**
     * An example of a method - replace this comment with your own
     */
    public static ArrayList<Item> getItemDatabase() {

        return ITEM_DATABASE;
    }

    public static int getLastItemID() {
        return LAST_ITEM_ID;
    }

    public static Item getItemFromID(int id) {
        for (Item i : ITEM_DATABASE
        ) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static ArrayList<Item> getItemFromSupplier(Supplier supplier) {
        ArrayList<Item> ItemSupplier = new ArrayList<Item>();
        boolean status = false;
        for (Item i : ITEM_DATABASE
        ) {
            if (i.getSupplier().equals(supplier)) {
                ItemSupplier.add(i);
                status = true;
            }
        }
        if (status) {
            return ItemSupplier;
        } else {
            return null;
        }
    }

    public static ArrayList<Item> getItemFromCategory(ItemCategory category) {
        ArrayList<Item> ItemSupplier = new ArrayList<Item>();
        boolean status = false;
        for (Item i : ITEM_DATABASE
        ) {
            if (i.getCategory().equals(category)) {
                ItemSupplier.add(i);
                status = true;
            }
        }
        if (status) {
            return ItemSupplier;
        } else {
            return null;
        }
    }

    public static ArrayList<Item> getItemFromStatus(ItemStatus status) {
        ArrayList<Item> ItemSupplier = new ArrayList<Item>();
        boolean statusa = false;
        for (Item i : ITEM_DATABASE
        ) {
            if (i.getStatus().equals(status)) {
                ItemSupplier.add(i);
                statusa = true;
            }
        }
        if (statusa) {
            return ItemSupplier;
        } else {
            return null;
        }
    }

    public static boolean removeItem(int id) {
        try {
            for (Item i : ITEM_DATABASE
            ) {
                if (i.getId() == id) {
                    ITEM_DATABASE.remove(i);
                    return true;

                }
            }
            throw new ItemNotFoundException(id);
        }

        catch(ItemNotFoundException ex)
        {
            System.out.println(ex.getExMessage());
            return false;
        }

    }
}
