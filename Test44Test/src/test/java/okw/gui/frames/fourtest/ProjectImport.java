package okw.gui.frames.fourtest;

import okw.OKW;
import okw.gui.adapter.selenium.*;


/**
 * Frame for https://4test.io:10443/project/
 * 
 * @author zoltan
 */
@OKW( FN = "4Test Project Import" )
public class ProjectImport extends Projects
{

    /**
     * <div class="formRow---352zE">
     *   <button>Import Project Data</button>
     * </div>
     */
    @OKW( FN = "Import Project Data" )
    public SeButton myImportProjectData= new SeButton( "//div[contains(@class, 'formRow')]/button" );    
    
    /**
     * <div class="sampleProjects---3BW6r">
     *    <a>
     *    <svg width="28" height="28">
     *    <path d="M13.845 0C6.278.08.113 6.182 0 13.792v.44c.126 7.56 6.231 13.654 13.791 13.766 7.732.115 14.093-6.06 14.207-13.79.115-7.731-6.06-14.092-13.79-14.206C14.085 0 13.964 0 13.844 0zM12.67 5.643h2.658c.082 0 .147.066.147.147v6.733h6.734c.081 0 .147.066.147.147v2.659a.148.148 0 0 1-.147.148h-6.734v6.733a.147.147 0 0 1-.147.147h-2.658a.147.147 0 0 1-.148-.147v-6.733H5.79a.148.148 0 0 1-.147-.148V12.67c0-.081.065-.147.147-.147h6.733V5.79c0-.081.066-.147.148-.147z" fill="teal">
     *    </path>
     *    </svg>
     *    <!-- react-text: 814 -->
     *    Add sample projects
     *    <!-- /react-text -->
     *    </a>
     * </div>
     */
    //@OKW( FN = "Add sample projects" )
    //public SeLink myAddSampleProjects= new SeLink( "//div[contains(@class, 'sampleProjects')]/a" );
    
    public ProjectImport()
    {
        setLocator( "//*[contains(@class, 'projectsWrapper')]/../../.." );
    }

}
