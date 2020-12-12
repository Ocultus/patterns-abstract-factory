class Gigabyte:ComputerHardwareFactory {
    override fun createPowerUnit(): PowerSupply {
        return PB500M()
    }

    override fun createVideoCard(): VideoCard {
        return RTX3060()
    }

    override fun createMotherboard(): Motherboard {
        return X570()
    }
}