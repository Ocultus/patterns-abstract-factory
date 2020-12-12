interface ComputerHardwareFactory {
    fun createPowerUnit(): PowerSupply
    fun createVideoCard(): VideoCard
    fun createMotherboard(): Motherboard
}