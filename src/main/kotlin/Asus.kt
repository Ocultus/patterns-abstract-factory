class Asus:ComputerHardwareFactory {
    override fun createPowerUnit(): PowerSupply {
        return T1200P()
    }

    override fun createVideoCard(): VideoCard {
        return GTX1660()
    }

    override fun createMotherboard(): Motherboard {
        return Z370P()
    }
}