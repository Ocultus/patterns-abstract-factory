fun main() {
    val factory: ComputerHardwareFactory = Asus()
    print("Computer characteristics:\n")
    print("Motherboard with ${factory.createMotherboard().getMemoryType()} memory\n")
    print("Video card with ${factory.createVideoCard().getVideoMemoryType()} memory\n")

    val secondFactory: ComputerHardwareFactory = Msi()
    secondFactory.createPowerUnit()
    print("Power supply with ${factory.createPowerUnit().getMaxLoadPower()} power\n")

}