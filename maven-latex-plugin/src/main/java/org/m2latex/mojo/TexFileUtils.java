/*
 * The akquinet maven-latex-plugin project
 *
 * Copyright (c) 2011 by akquinet tech@spree GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.m2latex.mojo;

import java.io.File;
import java.util.List;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

public interface TexFileUtils {

	String TEX4HT_OUTPUT_DIR = "m2latex_tex4ht_out";

	void copyLatexOutputToOutputFolder(File texFile, File tempDirectory,
			File targetSiteDirectory) throws MojoExecutionException,
			MojoFailureException;

	void copyLatexSrcToTempDir(File texDirectory, File tempDirectory)
			throws MojoExecutionException;

	void copyTex4htOutputToOutputFolder(File texFile, File baseDirectory,
			File outputDirectory, File targetSiteDirectory)
			throws MojoFailureException, MojoExecutionException;

	File getCorrespondingAuxFile(File texFile);

	File getCorrespondingBcfFile(File texFile);

	File getCorrespondingDviFile(File texFile);

	File getCorrespondingLogFile(File texFile);

	File getCorrespondingPdfFile(File texFile);

	File getCorrespondingIdxFile(File texFile);

	File getCorrespondingIstFile(File texFile);

	File getCorrespondingGlgFile(File texFile);

	File getCorrespondingGlsFile(File texFile);

	File getCorrespondingGloFile(File texFile);

	String getFileNameWithoutSuffix(File texFile);

	/*
	 * @param tempDir
	 * 
	 * @return A List of java.io.File objects denoting the LaTeX documents to
	 * process.
	 * 
	 * @throws MojoExecutionException
	 */
	List getLatexMainDocuments(File directory) throws MojoExecutionException;

	boolean matchInCorrespondingLogFile(File texFile, String pattern)
			throws MojoExecutionException;

	File createTex4htOutputDir(File tempDir) throws MojoExecutionException;
}