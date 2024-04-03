package zoo;

public abstract class Animal 
{
    public abstract void somDoAnimal();
    
    public void animalComFome()
    {
        somDoAnimal();
        somDoAnimal();
        somDoAnimal();
    }
}
