public enum Category {
    Imported(5),
    Exempted(0),
    NonExempted(10);

    double tax_percent;

    Category(double tax_percent){
        this.tax_percent = tax_percent;
    }

}
