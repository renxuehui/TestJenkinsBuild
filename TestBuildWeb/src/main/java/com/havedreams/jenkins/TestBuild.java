package com.havedreams.jenkins;

import java.io.IOException;

import org.gitlab4j.api.GitLabApi;
import org.gitlab4j.api.GitLabApiException;
import org.gitlab4j.api.models.CompareResults;
import org.gitlab4j.api.models.Diff;

public class TestBuild {
//	13560af0782eb2c5fb6278b2527f90ca95675616
	private static GitLabApi gitLabApi = new GitLabApi("https://github.com/renxuehui/havedreams.git", "13560af0782eb2c5fb6278b2527f90ca95675616");
	
	public static void main(String[] args) throws IOException, GitLabApiException {
		CompareResults compareResults = gitLabApi.getRepositoryApi().compare(123, "from", "to");
		
		for (Diff diff : compareResults.getDiffs()) {
			diff.getDiff().indexOf("");
		}
	}
}
