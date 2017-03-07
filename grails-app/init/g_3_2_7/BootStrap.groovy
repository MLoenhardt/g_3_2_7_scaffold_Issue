package g_3_2_7

import de.unikoeln.D1
import de.unikoeln.D2

class BootStrap {

    def init = { servletContext ->
        if (!D1.count) {
            new D1(d1a1: "d1a1").save(flush: true)
        }
        if (!D2.count) {
            new D2(d2a1: "d2a1").save(flush: true)
        }
    }
    def destroy = {
    }
}
