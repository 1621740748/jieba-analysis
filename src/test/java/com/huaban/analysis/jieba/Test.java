package com.huaban.analysis.jieba;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import com.huaban.analysis.jieba.JiebaSegmenter.SegMode;

public class Test {

	public static void main(String[] args) {
		JiebaSegmenter segmenter = new JiebaSegmenter();
		String[] sentences = new String[] { "我的老婆很漂亮"
				,"猜猜我是谁"
				,"天剑绝刀这部电影很好看"
				,"西直门是门吗"
				,"大话西游里面的孙悟空是谁演的,演的真好"
				,"注意：自动计算的词频在使用HMM新词发现功能时可能无效"

		};
		for (String sentence : sentences) {
			List<SegToken> tokens = segmenter.process(sentence, SegMode.SEARCH);
			System.out.print(String.format(Locale.getDefault(), "\n%s\n%s", sentence, tokens.stream().map(t->t.word).collect(Collectors.joining(","))));
		}
	}

}
