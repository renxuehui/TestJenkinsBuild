package com.havedreams.jenkins;

import java.io.IOException;

import org.gitlab4j.api.GitLabApi;
import org.gitlab4j.api.GitLabApiException;
import org.gitlab4j.api.models.Commit;
import org.gitlab4j.api.models.CompareResults;
import org.gitlab4j.api.models.Diff;
import org.gitlab4j.api.models.MergeRequest;

public class TestBuild {
    private static GitLabApi gitLabApi = new GitLabApi("https://api.github.com/renxuehui/havedreams.git", "13560af0782eb2c5fb6278b2527f90ca95675616");
    
    public static void main(String[] args) throws IOException, GitLabApiException {
        CompareResults compareResults = gitLabApi.getRepositoryApi().compare(2, "master", "release");
        
//        Commit commit;
//		gitLabApi.getRepositoryApi().getBranch(2, "master").withCommit(commit).getMerged();
		
//		gitLabApi.getMergeRequestApi().createMergeRequest(projectIdOrPath, sourceBranch, targetBranch, title, description, assigneeId, targetProjectId, labels, milestoneId, removeSourceBranch)
        
//		MergeRequest mergeRequest;
		
        for (Diff diff : compareResults.getDiffs()) {
            diff.getDiff().indexOf("");
        }
    }
}
