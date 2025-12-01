package assignment15;

import java.util.Arrays;
import java.util.List;

interface MealPlan {
    String name();
}

class VegetarianMeal implements MealPlan {
    @Override
    public String name() {
        return "Vegetarian";
    }
}

class VeganMeal implements MealPlan {
    @Override
    public String name() {
        return "Vegan";
    }
}

class KetoMeal implements MealPlan {
    @Override
    public String name() {
        return "Keto";
    }
}

class Meal<T extends MealPlan> {
    private final T plan;

    Meal(T plan) {
        this.plan = plan;
    }

    public T getPlan() {
        return plan;
    }
}

public class MealPlanDemo {
    public static <T extends MealPlan> Meal<T> generatePlan(T plan) {
        return new Meal<>(plan);
    }

    public static void main(String[] args) {
        List<Meal<?>> meals = Arrays.asList(
                generatePlan(new VegetarianMeal()),
                generatePlan(new VeganMeal()),
                generatePlan(new KetoMeal()));
        meals.forEach(meal -> System.out.println(meal.getPlan().name()));
    }
}
