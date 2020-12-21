package inherittancemethods.products;

import java.math.BigDecimal;

public class PackedProduct extends Product {

    private int packingUnit;
    private BigDecimal weightOfBox;

    public PackedProduct(String name, BigDecimal unitWeight, int numberOfDecimals, int packingUnit, BigDecimal weightOfBox) {
        super(name, unitWeight, numberOfDecimals);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }


    public int getPackingUnit() {
        return packingUnit;
    }

    public BigDecimal getWeightOfBox() {
        return weightOfBox;
    }

    @Override
    public BigDecimal totalWeight(int pieces) {
        int fullBoxes = pieces / packingUnit;
        int part = pieces - fullBoxes * packingUnit;
        return super.totalWeight(packingUnit)
                .multiply(BigDecimal.valueOf(fullBoxes))
                .add(super.totalWeight(part))
                .add(weightOfBox.multiply(BigDecimal.valueOf(fullBoxes + 1)));
    }
}
