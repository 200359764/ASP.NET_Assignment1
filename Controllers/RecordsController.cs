using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace High_M_Music_Records.Controllers
{
    public class RecordsController : Controller
    {
        // GET: Records
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult Artist(String ArtistName)
        {
            ViewBag.ArtistName = ArtistName;
            return View();
        }
    }
}