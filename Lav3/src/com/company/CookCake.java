package com.company;

class Cake {
    boolean ready = false;
    boolean decorate = false;


    public void DecorateCake() { // Украшение торта
        System.out.println("Decorated cake");
        decorate = true;
    }

    public void MakeCake() {// приготовление торта
        System.out.println("Cake is ready ");
        ready = true;
    }


}

class Decorates {
    boolean cut = false;

    public void CutDecoration() { // Нарезать украшения
        System.out.println("Decorates is cut");
        cut = true;
    }
}

class Ingredients {
    boolean in_plate = false;
    boolean mix = false;
    boolean in_oven = false;
    boolean here = false;

    public void InputIngredient() { // положить ингредиенты в тарелку
        System.out.println("Ingredients in plate");
        in_plate = true;
    }

    public void MixedCake() {// Мешать ингредиенты
        System.out.println("Ingredients is mixed");
        mix = true;
    }

    public void InputInOven() { // Полодить перемешанные ингредиенты в духовку
        System.out.println("Mixed Ingredients in oven");
        in_oven = true;
    }

}
class Human{
    boolean wait = false;
    public void Wait() { // Подождать духовку
        System.out.println("Human waited");
        wait = true;
    }
}

class Dough {

    boolean bake = false;
    boolean ready = false;



    public void BakeDough() { // Тесто выпекается
        System.out.println("Dough is baked");
        bake = true;
    }

    public void ReadyDough() { // тесто готовится
        System.out.println("Dough is ready");
        ready = true;
    }
}

public class CookCake {

    public static void main(String[] args) {
        // write your code here
        //System.out.print("LOL");
        Cake cake = new Cake();
        Ingredients ingredient = new Ingredients();
        Dough dough = new Dough();
        Decorates decorates = new Decorates();
        Human human = new Human();
        ingredient.here = true;
        if (ingredient.here == true) {
            System.out.println("Ingredients  here");
            if (ingredient.in_plate == false) {
                System.out.println("Ingredients not in plate");
                ingredient.InputIngredient();
            }
            if (ingredient.mix == false) {
                System.out.println("Ingredients not mixed");
                ingredient.MixedCake();
            }
            if (ingredient.in_oven == false) {
                System.out.println("Mixed Ingredients not in oven");
                ingredient.InputInOven();

            }
            if (human.wait == false) {
                System.out.println("Human not wait");
                human.Wait();
            }
            if (dough.bake == false) {
                System.out.println("Dough not baked");
                dough.BakeDough();
            }
            if (dough.ready == false) {
                System.out.println("Dough is not ready");
                dough.ReadyDough();
            }
            if (decorates.cut == false) {
                System.out.println("Decorates is not cut");
                decorates.CutDecoration();
            }
            if (cake.decorate == false) {
                System.out.println("Cake is not decorated");
                cake.DecorateCake();
            }
            if (cake.decorate == true && decorates.cut == true) {

                cake.MakeCake();
            }


        }
        if (ingredient.here == false)
        {
            System.out.println("Ingredients not here");
            System.out.println("Ingredients not in plate");


            System.out.println("Ingredients not mixed");


            System.out.println("Mixed Ingredients not in oven");



            System.out.println("Human not wait");



            System.out.println("Dough not baked");

            System.out.println("Dough is not ready");



            System.out.println("Decorates is not cut");


            System.out.println("Cake is not decorated");
            System.out.println("Cake is not ready");



        }
    }

}
