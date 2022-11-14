import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class MainKtTest {

    @Test
    fun main() {

    }

    @Test
    fun addNote() {
        val service = NoteService()
        val result = service.add(Note(0, false, 123, "title1", "text1", 0, 0, "all", "all"))

        assertTrue(result == 1)
    }

    @Test
    fun getService() {
        val service = NoteService()
        val note = Note(0, false, 100, "title1", "text1", 0, 0, "all", "all")
        service.add(note)
        val result = note==service.getById(1)
        assertTrue(result)
    }

    @Test
    fun getService2() {
        val service = NoteService()
        val note = Note(0, false, 200, "title1", "text1", 0, 0, "all", "all")
        service.add(note)
        val result = note==service.getById(2)
        assertFalse(result)
    }
}


