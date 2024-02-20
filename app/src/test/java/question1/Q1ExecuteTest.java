package question1;

import static org.assertj.core.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Q1ExecuteTest {

    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Tag("Q1")
    @Test
    public void testMainMethodOutput() {
        // Q1Execute.mainを実行
        Q1Execute.main(new String[]{});

        // 出力結果を取得してStringに変換
        String output = outContent.toString();

        // 出力結果が期待通りか検証（AssertJを使用）
        assertThat(output)
                .contains("Benjamin, 69 years old") // Benjaminの情報が含まれているか
                .contains("Chiara, 32 years old") // Chiaraの情報が含まれているか
                .doesNotContain("Allice, 18 years old"); // Alliceの情報が含まれていないことを確認
    }
}
