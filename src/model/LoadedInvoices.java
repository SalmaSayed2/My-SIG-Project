package model;

import java.util.ArrayList;

public class LoadedInvoices {
    private static ArrayList<InvoiceHeaderTrial5> invoices = new ArrayList<>();

    public static ArrayList<InvoiceHeaderTrial5> getInvoices() {
        return invoices;
    }

    public static void setInvoices(ArrayList<InvoiceHeaderTrial5> invoices) {
        LoadedInvoices.invoices = invoices;
    }

    public static void deleteInvoice(int invoiceNum) {
        for(int index = 0 ; index < invoices.size() ; index++) {
            if(invoices.get(index).getInvoiceNum() == invoiceNum){
                invoices.remove(index);
                return;
            }
        }
    }

    public static void updateInvoice(InvoiceHeaderTrial5 newInvoice) {
        // If the app found the invoice number existing in the database, replace the old data
        for(int index = 0 ; index < invoices.size() ; index++) {
            if (newInvoice.getInvoiceNum() == invoices.get(index).getInvoiceNum()) {
                invoices.set(index,newInvoice);
                return;
            }
        }
        // If the invoice number is new, then add the invoice as a new invoice
        invoices.add(newInvoice);
    }

    public static InvoiceHeaderTrial5 getInvoiceByInvoiceNumber(int invoiceNumber) {
        for (InvoiceHeaderTrial5 invoice : invoices) {
            if (invoiceNumber == invoice.getInvoiceNum()) {
                return invoice;
            }
        }
        return null;
    }

    public static void addNewItem(int invoiceNumber) {
        for (InvoiceHeaderTrial5 invoice : invoices) {
            if (invoiceNumber == invoice.getInvoiceNum()) {
                int itemsCount = invoice.getInvoiceLines().size();
                invoice.addInvoiceLine(new InvoiceLineTrail4("Item"+(itemsCount+1),0,0,invoice));
            }
        }
    }

    public static void deleteItem(int invoiceNumber,int index) {
        for (InvoiceHeaderTrial5 invoice : invoices) {
            if (invoiceNumber == invoice.getInvoiceNum()) {
                invoice.deleteItem(index);
            }
        }
    }

    public static void updateItem(int invoiceNumber,int itemIndex,String name,double price, int count) {
        for (InvoiceHeaderTrial5 invoice : invoices) {
            if (invoiceNumber == invoice.getInvoiceNum()) {
                invoice.updateItem( itemIndex, name, price,  count);
            }
        }
    }

    public static void setCustomerName(int invoiceNumber,String name) {
        for (InvoiceHeaderTrial5 invoice : invoices) {
            if (invoiceNumber == invoice.getInvoiceNum()) {
                invoice.setCustomerName(name);
            }
        }
    }

    public static void setInvoiceDate(int invoiceNumber,String date) {
        for (InvoiceHeaderTrial5 invoice : invoices) {
            if (invoiceNumber == invoice.getInvoiceNum()) {
                invoice.setInvoiceDate(date);
            }
        }
    }
}
