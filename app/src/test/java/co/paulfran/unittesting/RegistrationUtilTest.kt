package co.paulfran.unittesting


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {
    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        // using our own assertion library (truth)
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and matching passwords return true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Jesus",
            "123",
            "123"
        )
        // using our own assertion library (truth)
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Paul",
            "123",
            "123"
        )
        // using our own assertion library (truth)
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Jesus",
            "",
            ""
        )
        // using our own assertion library (truth)
        assertThat(result).isFalse()
    }

    @Test
    fun `passwords dont match returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Jesus",
            "12346",
            "1234"
        )
        // using our own assertion library (truth)
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than two digits returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Jesus",
            "qwerty1",
            "qwerty1"
        )
        // using our own assertion library (truth)
        assertThat(result).isFalse()
    }


}