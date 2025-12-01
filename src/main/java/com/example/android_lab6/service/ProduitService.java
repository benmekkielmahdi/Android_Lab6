package com.example.android_lab6.service;

import com.example.android_lab6.R;
import com.example.android_lab6.classes.Produit;
import com.example.android_lab6.dao.IDao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProduitService implements IDao<Produit> {

    private static ProduitService INSTANCE;
    private final List<Produit> data = new ArrayList<>();

    private ProduitService() {
        seed(); // préremplissage
    }

    public static synchronized ProduitService getInstance() {
        if (INSTANCE == null) INSTANCE = new ProduitService();
        return INSTANCE;
    }

    private void seed() {
            create(new Produit("BARBECUED CHICKEN PIZZA", 3, R.mipmap.pizza1, "35 min",
                    "- 2 boneless skinless chicken breast halves (6 ounces each)\n- 1/4 teaspoon pepper\n- 1 cup barbecue sauce, divided\n- 1 tube (13.8 ounces) refrigerated pizza crust\n- 2 teaspoons olive oil\n-2 cups shredded Gouda cheese\n-1 small red onion, halved and thinly sliced\n-1/4 cup minced fresh cilantro",
                    "So fast and so easy with refrigerated pizza crust, these saucy, smoky pizzas make quick fans...",
                    "STEP 1: Sprinkle chicken with pepper; grill...\nSTEP 2: Divide dough...\nSTEP 3: Spread sauce and top cheese..."));

            create(new Produit("BRUSCHETTA PIZZA", 5, R.mipmap.pizza2, "35 min",
                    "- 1/2 pound reduced-fat bulk pork sausage\n- 1 prebaked 12-inch pizza crust\n- 1 package sliced turkey pepperoni\n- 2 cups shredded part-skim mozzarella cheese\n- 1-1/2 cups chopped plum tomatoes\n- 1/2 cup fresh basil leaves, thinly sliced",
                    "You might need a knife and fork for this hearty pizza! Loaded with Italian flavor...",
                    "STEP 1: Cook sausage; bake crust with toppings...\nSTEP 2: Combine tomatoes, basil, oil..."));

            create(new Produit("SPINACH PIZZA", 2, R.mipmap.pizza3, "25 min",
                    "- 1 package pizza crust mix\n- 1/2 cup Alfredo sauce\n- 2 medium tomatoes\n- 4 cups chopped fresh spinach\n- 2 cups shredded Italian cheese blend",
                    "This tasty pizza is so easy to prepare...",
                    "STEP 1: Prepare dough...\nSTEP 2: Spread Alfredo sauce...\nSTEP 3: Bake at 450°..."));

            create(new Produit("DEEP-DISH SAUSAGE PIZZA", 8, R.mipmap.pizza4, "45 min",
                    "- 1 package active dry yeast\n- 2/3 cup warm water\n- 1-3/4 to 2 cups all-purpose flour\n- 1/4 cup vegetable oil\n- 1 teaspoon dried oregano, basil and marjoram",
                    "My Grandma made the tastiest snacks...",
                    "STEP 1: Dissolve yeast; knead dough...\nSTEP 2: Saute onion, peppers...\nSTEP 3: Layer dough and fillings; bake..."));

            create(new Produit("HOMEMADE PIZZA", 4, R.mipmap.pizza5, "50 min",
                    "- 1 package active dry yeast\n- 1 teaspoon sugar\n- 1-1/4 cups warm water\n- 1/4 cup canola oil\n- 1 teaspoon salt\n- 3-1/2 cups all-purpose flour\n- 1/2 pound ground beef",
                    "This recipe is a hearty, zesty main dish...",
                    "STEP 1: Dissolve yeast and sugar...\nSTEP 2: Knead dough, prepare beef...\nSTEP 3: Assemble pizza and bake..."));

            create(new Produit("PESTO CHICKEN PIZZA", 3, R.mipmap.pizza6, "50 min",
                    "- 2 teaspoons active dry yeast\n- 1 cup warm water\n- 2-3/4 cups bread flour\n- 1 tablespoon plus 2 teaspoons olive oil\n- 1 tablespoon sugar\n- 1-1/2 teaspoons salt\n- 1/2 pound chicken breasts\n- 1 small onion\n- 1/2 each small green, red and yellow peppers\n- 1/2 cup sliced fresh mushrooms\n- 3 tablespoons pesto\n- 1-1/2 cups shredded mozzarella cheese",
                    "This is the only pizza I make now...",
                    "STEP 1: Dissolve yeast; knead dough...\nSTEP 2: Cook chicken and vegetables...\nSTEP 3: Assemble pizza and bake..."));

            create(new Produit("LOADED MEXICAN PIZZA", 3, R.mipmap.pizza7, "30 min",
                    "- 1 can black beans\n- 1 medium red onion\n- 1 small sweet yellow pepper\n- 3 teaspoons chili powder\n- 3/4 teaspoon ground cumin\n- 3 medium tomatoes\n- 1 jalapeno pepper\n- 1 garlic clove\n- 1 prebaked thin pizza crust",
                    "Healthy pizza with lots of flavor...",
                    "STEP 1: Mash black beans, mix toppings...\nSTEP 2: Spread on crust, bake..."));

            create(new Produit("BACON CHEESEBURGER PIZZA", 2, R.mipmap.pizza8, "20 min",
                    "- 1/2 pound ground beef\n- 1 small onion\n- 1 prebaked Italian bread crust\n- 1 can pizza sauce\n- 6 bacon strips\n- 20 dill pickle slices\n- 2 cups mozzarella\n- 2 cups cheddar\n- 1 teaspoon Italian seasoning",
                    "Kids of all ages love pizza and cheeseburgers...",
                    "STEP 1: Cook beef and onion...\nSTEP 2: Assemble pizza with toppings...\nSTEP 3: Bake at 450°..."));

            create(new Produit("PIZZA MARGHERITA", 1, R.mipmap.pizza9, "30 min",
                    "- 3 teaspoons active dry yeast\n- 1 cup warm water\n- 2 tablespoons olive oil\n- 1 teaspoon sugar\n- 1 teaspoon salt\n- 3 cups bread flour",
                    "Classic Pizza Margherita...",
                    "STEP 1: Dissolve yeast, knead dough...\nSTEP 2: Roll dough, add toppings...\nSTEP 3: Bake at 450°..."));

            create(new Produit("PEPPERONI-SAUSAGE STUFFED PIZZA", 5, R.mipmap.pizza10, "45 min",
                    "- 1 package active dry yeast\n- 1-1/4 cups warm water\n- 2 tablespoons olive oil\n- 1-1/2 teaspoons salt\n- 1 teaspoon sugar\n- 3-1/2 to 4 cups flour",
                    "Friends have been telling me to open a pizzeria...",
                    "STEP 1: Dissolve yeast, knead dough...\nSTEP 2: Assemble stuffed pizza...\nSTEP 3: Bake at 425°, then 375°..."));
        }



    @Override
    public Produit create(Produit p) {
        data.add(p);
        return p;
    }

    @Override
    public Produit update(Produit p) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == p.getId()) {
                data.set(i, p);
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean delete(long id) {
        return data.removeIf(x -> x.getId() == id);
    }

    @Override
    public Produit findById(long id) {
        for (Produit p : data) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return Collections.unmodifiableList(data);
    }
}
