package transport_features;

import service.Serviceable;

public abstract class Transport implements Serviceable {

    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }


    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }



    @Override
    public void service() {
        System.out.println("Обслуживаем: " + modelName);
        System.out.println(" - - - - - - -  ");
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }

    }

    @Override
    public String toString() {
        return "Транспорт - " +
                "Модель: " + modelName +
                ", Количество колес: " + wheelsCount;
    }
}
