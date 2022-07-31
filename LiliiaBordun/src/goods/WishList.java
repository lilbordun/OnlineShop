package goods;

public class WishList extends Items{
        private Clothes nameOfClothes;
        private Accessories nameOfAccessories;
        private Shoes nameOsShoes;

        WishList(){}

        WishList(Clothes nameOfClothes, Accessories nameOfAccessories, Shoes nameOsShoes){
         this.nameOfClothes = nameOfClothes;
         this.nameOfAccessories = nameOfAccessories;
         this.nameOsShoes = nameOsShoes;
        }

        public Clothes getNameOfClothes() {
                return nameOfClothes;
        }

        public void setNameOfClothes(Clothes nameOfClothes) {
                this.nameOfClothes = nameOfClothes;
        }

        public Accessories getNameOfAccessories() {
                return nameOfAccessories;
        }

        public void setNameOfAccessories(Accessories nameOfAccessories) {
                this.nameOfAccessories = nameOfAccessories;
        }

        public Shoes getNameOsShoes() {
                return nameOsShoes;
        }

        public void setNameOsShoes(Shoes nameOsShoes) {
                this.nameOsShoes = nameOsShoes;
        }
}
